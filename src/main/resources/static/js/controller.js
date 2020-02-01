var app = angular.module('app', []);
app.controller('postcontroller', function($scope, $http, $location) {
  $scope.submitForm = function(){
    var url = $location.absUrl() + "postPerson";

    var config = {
                headers : {
                    'Accept': 'text/plain'
                }
        }
    var data = {
            first_name: $scope.first_name,
            last_name: $scope.last_name,
            age: $scope.age,
            favourite_colour: $scope.favourite_colour,
            hobby: $scope.hobby
        };

    $http.post(url, data, config).then(function (response) {
      $scope.postResultMessage = response.data;
    }, function error(response) {
      $scope.postResultMessage = "Error with status: " +  response.statusText;
    });

    $scope.first_name = "";
    $scope.last_name = "";
    $age= "";
    $favourite_colour= "";
    $hobby= "";
  }
});

app.controller('getcontroller', function($scope, $http, $location) {
  $scope.getfunction = function(){
    var url = $location.absUrl() + "getAllPersons";

    $http.get(url).then(function (response) {
      $scope.response = response.data
    }, function error(response) {
      $scope.postResultMessage = "Error with status: " +  response.statusText;
    });
  }
});