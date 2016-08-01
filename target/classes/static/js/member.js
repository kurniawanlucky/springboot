var aplikasiPelatihan= angular.module('aplikasiPelatihan',[]);

aplikasiPelatihan.controller('HaloController',function($scope){
    $scope.daftarEmail=[
        'lucky@gmail.com',
        'kurniawanluckyy@gmail.com',
        'pio.pio.s88@gmail.com'
    ];
    
    $scope.tambahEmail = function(){
        $scope.daftarEmail.push($scope.email);
        
    };
    
    $scope.hapusEmail = function(e){
        var lokasiIndex=$scope.daftarEmail.indexOf(e);
        if(lokasiIndex > -1){
            $scope.daftarEmail.splice(lokasiIndex,1);
        }
        
    };
});

aplikasiPelatihan.controller('MemberJSController',function($http, $scope){
    $scope.dataMember = {};
    
    $scope.updateDataMember = function(){
        $http.get('/JSMember/listMember').then(sukses, gagal);
        
        function sukses(response){
            $scope.dataMember = response.data;
            console.log($scope.dataMember);
        };
        
        function gagal(response){
            console.log(response);
        };
    };
    
    $scope.updateDataMember();
});