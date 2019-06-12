webApps.controller('appHeaderCtrl', ['$scope','$rootScope','$document', function ($scope,$rootScope,$document) {

	$scope.toggleMenu=function(){
		if( angular.element('.wrapper').hasClass('main-nav-minified') ) {
			angular.element('.wrapper').removeClass('main-nav-minified');
			angular.element('#main-nav').hide();
			angular.element('#fixed-left-nav').removeAttr('disabled');
			setTimeout(
				function () {
					angular.element('#main-nav').fadeIn(500);
				}, 100);
		} else {
			angular.element('.wrapper').addClass('main-nav-minified');
			angular.element('#fixed-left-nav').attr('checked', false).attr('disabled', true);
		}
	}
	
	//$scope.toggleMenu();
	
}]);