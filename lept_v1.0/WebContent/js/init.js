/**
 * 
 */
$(function(){
	setTimeout(aa, 100);
	if ($.cookie('easyuiThemeName')) {
		changeUI($.cookie('easyuiThemeName'));
	}
});
function changeUI(themeName) {
	/* 更换主题 */
	var $easyuiTheme = $('#easyuiTheme');
	var url = $easyuiTheme.attr('href');
	var href ="./js/jquery-easyui-1.5/themes/"+ themeName + "/easyui.css";
	$easyuiTheme.attr('href', href);
	var $iframe = $('iframe');
	if ($iframe.length > 0) {
		for (var i = 0; i < $iframe.length; i++) {
			var ifr = $iframe[i];
			$(ifr).contents().find('#easyuiTheme').attr('href', href);
		}
	}
	$.cookie('easyuiThemeName', themeName);
}
function aa() {
	$('#main-center').panel('refresh', './pages/test/test.jsp')
}