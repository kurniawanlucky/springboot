var aplikasiPelatihan= angular.module('aplikasiPelatihan',[]);


aplikasiPelatihan.controller('CategoryController',function($http, $scope){
    $scope.dataMateri = {};
    
    $scope.simpanMateri = function (){
        $http.post("/category/peserta1",$scope.category).then(sukses,gagal);
        
        function sukses(response){
            $scope.updateDataMateri();
            window.console.log("sukses");
            console.log($scope.dataMateri);
        };
        
        function gagal(response){
            window.console.log("gagal");
            console.log(response);
        };
    }
    
    $scope.hapusMateri=function (x){
        window.console.log(x.iDCategori);
        $http.delete('/category/peserta/'+x.idcategori).then(sukses,gagal);
        
        function sukses(response){
            $scope.updateDataMateri();
            console.log($scope.dataMateri);
        };
        
        function gagal(response){
            console.log(response);
        };
    };
    
    $scope.updateDataMateri = function(){
        $http.get('/category/listCategory').then(sukses, gagal);
        
        function sukses(response){
            $scope.dataMateri = response.data;
            console.log($scope.dataMateri);
        };
        
        function gagal(response){
            console.log(response);
        };
    };
    
    $scope.updateDataMateri();
});