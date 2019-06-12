var invApp = angular.module('invApp', []);

invApp.config(['$stateProvider', '$urlRouterProvider', '$httpProvider',
    function ($stateProvider, $urlRouterProvider, $httpProvider) {
		$stateProvider.state('invmain', {
			url: '/invmain',
			templateUrl: 'apps/inventory/index.html'
		});
		
		
		$stateProvider.state('invmain.app', {
			url :'/app/:cache',
			templateUrl : 'apps/app/app.html',
			controller : 'appCtrl'
		});
		
		$stateProvider.state('invmain.app.dashboard', {
			url: '/dashboard',
			templateUrl: 'apps/inventory/dashboard/invDashboard.html',
			controller : 'invDashboardCtrl'
		});
		
		$stateProvider.state('invmain.app.inventory', {
			url: '/inventory',
			templateUrl: 'apps/inventory/main/inventory.html',
			controller : 'invInventoryCtrl'
		});
		
		$stateProvider.state('invmain.app.notification', {
			url: '/notification',
			templateUrl: 'apps/inventory/notification/invNotification.html',
			controller : 'invNotificationCtrl'
		});
		
		$stateProvider.state('invmain.app.setting', {
			url: '/setting',
			templateUrl: 'brijframework/frame/panel/viewPanel.html',
			controller : 'viewPanelCtrl'
		});
	
		$stateProvider.state('invmain.app.categoriesGroup', {
			url: '/categoriesGroup',
			templateUrl: 'apps/inventory/setting/invCategoryGroup.html',
			controller : 'invCategoryGroupCtrl'
		});
		
		$stateProvider.state('invmain.app.categories', {
			url: '/categories',
			templateUrl: 'apps/inventory/setting/invCategory.html',
			controller : 'invCategoryCtrl'
		});
		
		$stateProvider.state('invmain.app.product', {
			url: '/product',
			templateUrl: 'apps/inventory/setting/invProduct.html',
			controller : 'invProductCtrl'
		});
		
		
		$stateProvider.state('invmain.app.prep', {
			url: '/prep',
			templateUrl: 'apps/inventory/setting/invPrep.html',
			controller : 'invPrepCtrl'
		});
		
		$stateProvider.state('invmain.app.ingr', {
			url: '/ingr',
			templateUrl: 'apps/inventory/setting/invIngr.html',
			controller : 'invIngrCtrl'
		});
		
		$stateProvider.state('invmain.app.storage', {
			url: '/storage',
			templateUrl: 'apps/inventory/setting/invStorage.html',
			controller : 'invStorageCtrl'
		});
		
		$stateProvider.state('invmain.app.freq', {
			url: '/freq',
			templateUrl: 'apps/inventory/setting/invCountFreq.html',
			controller : 'invCountFreqCtrl'
		});
		
		
}]);