type = [ '', 'info', 'success', 'warning', 'danger' ];

var conteudoMsg = document.getElementById("conteudoMsg").value;
console.log(conteudoMsg);
var tipoMsg = document.getElementById("tipoMsg").value;
console.log(tipoMsg);
var iconeMsg = document.getElementById("iconeMsg").value;
console.log(iconeMsg);

notification = {
	showNotification : function(from, align, type, icon, message) {
		// color = Math.floor((Math.random() * 4) + 1);

		$.notify({
			icon : icon,
			message : message

		}, {
			type : type,
			timer : 4000,
			placement : {
				from : from,
				align : align
			}
		});
	}
}

notification.showNotification('top', 'center', tipoMsg, iconeMsg, conteudoMsg);
