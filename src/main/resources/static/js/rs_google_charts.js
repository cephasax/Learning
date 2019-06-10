var idDivCharts = 'div_charts';

function teste(content) {
	var chartsContent = content;

	google.charts.load('current', {
		'packages' : [ 'corechart' ]
	});

	google.charts.setOnLoadCallback(drawCharts);

	function drawCharts() {

		var contentChart = new Array();
		var qtdLines = chartsContent.lines.length;
		var i = 0;
		
		while(i < qtdLines){
			
			var lenLineContent = chartsContent.lines[i].lineContent.length;
			var isNewChart = false;
			var canCreateChart = false;
			var titleChart;

			if (lenLineContent == 1) {

				if (!isNewChart && contentChart.length > 0) {
					desenhaGrafico(titleChart, 'Processos', 'Quantidade',
							contentChart);
					contentChart = new Array();
				}
				
				isNewChart = true;
				contentChart = new Array();
				
				titleChart = chartsContent.lines[i].lineContent[0];
				
				if (titleChart == 'Processos em CARGA (apenas processos físicos)') {
					return;
				}
				
			} else if (!isNewChart) {
				contentChart.push(chartsContent.lines[i].lineContent);
			}
			
			i++;
		}

	}
}

function desenhaGrafico(title, labelColY, labelColX, values) {
	// Create the data table.
	console.log(title);
	console.log(values);

	var data = new google.visualization.DataTable();
	data.addColumn('string', labelColY);
	data.addColumn('number', labelColX);

	for (i = 0; i < values.length; i++) {
		var value = values[i][1];
		value = value.replace(/[^\d]+/g,'')
		data.addRow([ values[i][0], Number(value) ]);
	}

	// Set chart options
	var options = {
		'title' : title,
        'pieHole': 0.4,
		'width' : 1000,
		'height' : 300
	};


	// Instantiate and draw our chart, passing in some options.
	var mainDiv = document.getElementById(idDivCharts);
	var divChart = document.createElement("div");

	var chart = new google.visualization.PieChart(divChart);
	chart.draw(data, options);

	mainDiv.appendChild(divChart);
}
