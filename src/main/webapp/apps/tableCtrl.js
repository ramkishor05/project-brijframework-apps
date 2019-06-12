webApps.controller('tableCtrl', 
		function($scope, $rootScope, $document) {
	  $scope.totalItems = 64;
	  $scope.currentPage = 4;

	  $scope.setPage = function (pageNo) {
	    $scope.currentPage = pageNo;
	  };

	  $scope.pageChanged = function() {
	    $log.log('Page changed to: ' + $scope.currentPage);
	  };

	  $scope.maxSize = 5;
	  $scope.bigTotalItems = 175;
	  $scope.bigCurrentPage = 1;
			$scope.dataArray = [
				  {
					    "id": "Chrome",
					    "name": "Macintosh",
					    "visits": "360"
					  },
					  {
					    "id": "Chrome",
					    "name": "Windows",
					    "visits": "582"
					  },
					  {
					    "id": "Chrome",
					    "name": "Linux",
					    "visits": "172"
					  },
					  {
					    "id": "Chrome",
					    "name": "iOS",
					    "visits": "86"
					  },
					  {
					    "id": "Firefox",
					    "name": "Windows",
					    "visits": "280"
					  },
					  {
					    "id": "Firefox",
					    "name": "Android",
					    "visits": "236"
					  },
					  {
					    "id": "Internet Explorer",
					    "name": "Windows",
					    "visits": "145"
					  },
					  {
					    "id": "Opera",
					    "name": "Windows",
					    "visits": "328"
					  },
					  {
					    "id": "22",
					    "name": "Macintosh"
					  },
					  {
					    "id": "Chrome",
					    "name": "iOS",
					    "visits": "45"
					  },
					  {
					    "id": "Chrome",
					    "name": "Linux",
					    "visits": "142"
					  },
					  {
					    "id": "96",
					    "name": "iOS"
					  },
					  {
					    "id": "Firefox",
					    "name": "Windows",
					    "visits": "235"
					  }
					];

		} );