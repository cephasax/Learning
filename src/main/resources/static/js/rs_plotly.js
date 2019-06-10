function makeBarChartWithDirectLabels(divChart) {
	var xValue = [ 'Product A', 'Product B', 'Product C' ];

	var yValue = [ 20, 14, 23 ];
	var yValue2 = [ 24, 16, 20 ];

	var trace1 = {
		x : xValue,
		y : yValue,
		type : 'bar',
		text : yValue.map(String),
		textposition : 'auto',
		hoverinfo : 'none',
		opacity : 0.5,
		marker : {
			color : 'rgb(158,202,225)',
			line : {
				color : 'rgb(8,48,107)',
				width : 1.5
			}
		}
	};

	var trace2 = {
		x : xValue,
		y : yValue2,
		type : 'bar',
		text : yValue2.map(String),
		textposition : 'auto',
		hoverinfo : 'none',
		marker : {
			color : 'rgba(58,200,225,.5)',
			line : {
				color : 'rgb(8,48,107)',
				width : 1.5
			}
		}
	};

	var data = [ trace1, trace2 ];

	var layout = {
		title : 'January 2013 Sales Report'
	};

	Plotly.newPlot(divChart, data, layout);
}

function makeDonutChart(divChart){
	var data = [{
		  values: [16, 15, 12, 6, 5, 4, 42],
		  labels: ['US', 'China', 'European Union', 'Russian Federation', 'Brazil', 'India', 'Rest of World' ],
		  domain: {column: 0},
		  name: 'GHG Emissions',
		  hoverinfo: 'label+percent+name',
		  hole: .4,
		  type: 'pie'
		},{
		  values: [27, 11, 25, 8, 1, 3, 25],
		  labels: ['US', 'China', 'European Union', 'Russian Federation', 'Brazil', 'India', 'Rest of World' ],
		  text: 'CO2',
		  textposition: 'inside',
		  domain: {column: 1},
		  name: 'CO2 Emissions',
		  hoverinfo: 'label+percent+name',
		  hole: .4,
		  type: 'pie'
		}];

		var layout = {
		  title: 'Global Emissions 1990-2011',
		  annotations: [
		    {
		      font: {
		        size: 20
		      },
		      showarrow: false,
		      text: 'GHG',
		      x: 0.17,
		      y: 0.5
		    },
		    {
		      font: {
		        size: 20
		      },
		      showarrow: false,
		      text: 'CO2',
		      x: 0.82,
		      y: 0.5
		    }
		  ],
		  showlegend: false,
		  grid: {rows: 1, columns: 2}
		};

		Plotly.newPlot(divChart, data, layout);
}

function makeGaugeChart(divChart){
	// Enter a speed between 0 and 180
	var level = 175;
	// Trig to calc meter point
	var degrees = 180 - level,
	     radius = .5;
	var radians = degrees * Math.PI / 180;
	var x = radius * Math.cos(radians);
	var y = radius * Math.sin(radians);

	// Path: may have to change to create a better triangle
	var mainPath = 'M -.0 -0.025 L .0 0.025 L ',
	     pathX = String(x),
	     space = ' ',
	     pathY = String(y),
	     pathEnd = ' Z';
	var path = mainPath.concat(pathX,space,pathY,pathEnd);

	var data = [{ type: 'scatter',
	   x: [0], y:[0],
	    marker: {size: 28, color:'850000'},
	    showlegend: false,
	    name: 'speed',
	    text: level,
	    hoverinfo: 'text+name'},
	  { values: [50/6, 50/6, 50/6, 50/6, 50/6, 50/6, 50],
	  rotation: 90,
	  text: ['TOO FAST!', 'Pretty Fast', 'Fast', 'Average',
	            'Slow', 'Super Slow', ''],
	  textinfo: 'text',
	  textposition:'inside',
	  marker: {colors:['rgba(14, 127, 0, .5)', 'rgba(110, 154, 22, .5)',
	                         'rgba(170, 202, 42, .5)', 'rgba(202, 209, 95, .5)',
	                         'rgba(210, 206, 145, .5)', 'rgba(232, 226, 202, .5)',
	                         'rgba(255, 255, 255, 0)']},
	  labels: ['151-180', '121-150', '91-120', '61-90', '31-60', '0-30', ''],
	  hoverinfo: 'label',
	  hole: .5,
	  type: 'pie',
	  showlegend: false
	}];

	var layout = {
	  shapes:[{
	      type: 'path',
	      path: path,
	      fillcolor: '850000',
	      line: {
	        color: '850000'
	      }
	    }],
	  title: 'Gauge Speed 0-100',
	  height: 1000,
	  width: 1000,
	  xaxis: {zeroline:false, showticklabels:false,
	             showgrid: false, range: [-1, 1]},
	  yaxis: {zeroline:false, showticklabels:false,
	             showgrid: false, range: [-1, 1]}
	};

	Plotly.newPlot(divChart, data, layout);
}

function makeColoredBarChart(divChart){
	var trace1 = {
			  x: [20, 14, 23],
			  y: ['giraffes', 'orangutans', 'monkeys'],
			  name: 'SF Zoo',
			  orientation: 'h',
			  marker: {
			    color: 'rgba(55,128,191,0.6)',
			    width: 1
			  },
			  type: 'bar'
			};

			var trace2 = {
			  x: [12, 18, 29],
			  y: ['giraffes', 'orangutans', 'monkeys'],
			  name: 'LA Zoo',
			  orientation: 'h',
			  type: 'bar',
			  marker: {
			    color: 'rgba(255,153,51,0.6)',
			    width: 1
			  }
			};

			var data = [trace1, trace2];

			var layout = {
			  title: 'Colored Bar Chart',
			  barmode: 'stack'
			};

			Plotly.newPlot(divChart, data, layout);
}

//makeBarChartWithDirectLabels('grafico2');
//makeColoredBarChart('grafico4');
