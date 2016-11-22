var Funchat=angular.module('Funchat',['ngRoute']);
Funchat.config(function($routeProvider)
{
$routeProvider.when('/register',
{
templateUrl:'partials/register.html',
controller:'registerController'
}).when('/login',
{
templateUrl : 'partials/login.html',
controller : 'loginController'
}).when('/blog',
{
templateUrl : 'partials/blog.html',
controller : 'blogController'
});
});
Funchat.controller('registerController',function($scope,$http)
		{
	console.log("iam register controller");
	$scope.register=function()
	{
	console.log("in register function");
	console.log("username:"+$scope.username);			
	console.log("password:" + $scope.password);

		console.log("DOB:" + $scope.dob);

		console.log("email:" + $scope.email);

		console.log("Address:" + $scope.address);

		console.log("state:" + $scope.state);
	
	
var UserDetails =
	{
	    username : $scope.username,
		password : $scope.password,
		email : $scope.email,
		dob      :$scope.dob,
		address  : $scope.address,
		state    : $scope.state
	};

      console.log("name:"+UserDetails.username);
//adduser from controller
var res =$http.post("http://localhost:2020/Funchat/adduser",UserDetails);
res.success(function(data,status,header,config)
		{
	console.log("status:"+status);
	var message;
	$scope.message="you are successfully registered";
	$scope.username="";
		$scope.password="";
		$scope.email="";
		$scope.dob="";
		$scope.address="";
		$scope.state="";
		
	});
	}
		});
Funchat.controller('blogController', function($scope)
{
	$scope.message="you are in blog page";
	});
		
