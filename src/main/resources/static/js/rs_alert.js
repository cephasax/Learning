var conteudoMsg = document.getElementById("conteudoMsg").value;
var tipoMsg = document.getElementById("tipoMsg").value;

function getTitle() {
	if (tipoMsg == 'error') {
		return 'Ops, algo deu errado...';
	} else if (tipoMsg == 'success') {
		return 'Ótimo!';
	} else if (tipoMsg == 'info') {
		return 'Atenção!';
	} else if (tipoMsg == 'warning') {
		return 'Eita!';
	} else if (tipoMsg == 'question') {
		return 'Então...';
	} else {
		return 'Olá!';
	}
}

function alert() {
	swal(getTitle(), conteudoMsg, tipoMsg);
}

alert();
