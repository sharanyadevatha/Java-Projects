function greetings() {
	// alert(document.loginform.username.value);
	sumptr(7, 7);
	// sumptr('7', '7');
}
var sumptr = function sum(num1, num2) {
	var res = num1 + num2;
	alert(res);
}

function test1() {
	var1 = 1;
}
test1();
function test2() {
	alert(var1);
}
test2();
function display()
{
	var hd=document.getElementById('hellodiv');
	hd.innerHtml='Clicked...';
}