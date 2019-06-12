webApps.controller('appMenusCtrl', ['$scope','$rootScope','$document', function ($scope,$rootScope,$document) {

	$mainMenu = angular.element('.main-menu');

	// init collapse first for browser without transition support (IE9) 
	$mainMenu.find('li').has('ul').children('ul').collapse({toggle: false});

	$mainMenu.find('li.active').has('ul').children('ul').addClass('in');
	$mainMenu.find('li').not('.active').has('ul').children('ul').removeClass('in');

	angular.element('.main-menu .submenu-toggle').click( function(e){
		e.preventDefault();
		$currentItemToggle = angular.element(this);
		$currentItem = angular.element(this).parent();
		$mainMenu.find('li').not($currentItem).not($currentItem.parents('li')).removeClass('active').children('ul.in').collapse('hide');
		$currentItem.toggleClass('active').children('ul').collapse('toggle');
	});

	function initObject(){
		
	}
	
	
}]);