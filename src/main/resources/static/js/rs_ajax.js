function updateStatusTask(idTask, newStatus) {
	var values = [idTask, newStatus];
	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : "/task/update/status",
		data : JSON.stringify(values),
		dataType : 'json',
		cache : false,
		timeout : 600000,
		success : function(data) {
			console.log("SUCCESS : ", data);
		},
		error : function(e) {
			console.log("ERROR : ", e);
		}
	});
}