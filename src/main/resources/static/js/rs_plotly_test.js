/*

class Trace {
	constructor(x, y, name, color){
		this.x = x;
		this.y = y;
		this.name = name;
		this.color = color;
	}
}

var x1 = [ 'Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec' ];
var y1 = [ 20, 14, 25, 16, 18, 22, 19, 15, 12, 16, 14, 17 ];
var name1 = 'Primary Product';
var color1 = 'rgb(49,130,189)';

var x2 = [ 'Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec' ];
var y2 = [ 19, 14, 22, 14, 16, 19, 15, 14, 10, 12, 12, 16 ];
var name2 = 'Secondary Product';
var color2 = 'rgb(204,204,204)';

var trace1 = new Trace(x1, y1, name1, color1);
var trace2 = new Trace(x2, y2, name2, color2);

var traces = [trace1, trace2];
 */

function populateTraces(value, index, array) {
	var trace = {
		x : value.x,
		y : value.y,
		type : value.type,
		name : value.name,
		orientation : value.orientation,
		marker : {
			color : value.color,
			opacity : 0.7
		}
	};
	return trace;
}

function makeBarChartWithRotatedLabels(divChart, graph) {

	var data = graph.traces.map(populateTraces);

	var layout = {
		title : graph.title,
		xaxis : {
			tickangle : -45
		},
		barmode : graph.barmode
	};

	Plotly.newPlot(divChart, data, layout, {
		showSendToCloud : true
	});
}

function makeColoredBarChart(divChart, graph) {
	var data = graph.traces.map(populateTraces);
	var layout = {
		title : graph.title,
		barmode : graph.barmode
	};
	Plotly.newPlot(divChart, data, layout);
}

function makePieChart(divChart, graph) {
	console.log(graph);
	var data = [ {
		values : graph.traces[0].y,
		labels : graph.traces[0].x,
		type : 'pie'
	} ];

	var layout = {
		title : graph.title
	};

	Plotly.newPlot(divChart, data, layout);
}

function makeDonutChart(divChart, graph) {
	var data = [ {
		values : trace.y,
		labels : trace.x,
		domain : {
			column : 0
		},
		name : trace.name,
		hoverinfo : 'label+percent+name',
		hole : .4,
		type : 'pie'
	} ];

	var layout = {
		title : graph.title,
		annotations : [ {
			font : {
				size : 20
			},
			showarrow : false,
			text : title,
			x : 0.17,
			y : 0.5
		} ],
		showlegend : false,
		grid : {
			rows : 1,
			columns : 2
		}
	};

	Plotly.newPlot(divChart, data, layout);
}

function makeLineChart(divChart, graph) {

	var data = graph.traces.map(populateTraces);
	var layout = {
		title : graph.title
	};
	Plotly.newPlot(divChart, data, layout);
}
