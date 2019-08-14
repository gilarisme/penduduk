angular.module('appPendudukController', []).controller('PendudukController', function($http, $scope) {

    $scope.penduduk = {
        alamatDesa: null,
        availableOptions: [
          {id: '1', name: 'Ngancar RT: 1/ RW: 1'},
          {id: '2', name: 'Penjalin RT: 2/ RW: 1'},
          {id: '3', name: 'Tambak RT:3/ RW:1'},
          {id: '4', name: 'Kamandawa RT: 4/ RW: 1'},
          {id: '5', name: 'Gajah RT: 1/RW: 2'},
          {id: '6', name: 'Mintorogo RT: 2/RW: 2'},
          {id: '7', name: 'Pondok RT: 3/RW: 2'},
          {id: '8', name: 'KarangPanas RT: 4/RW: 2'}
        ]
       };

       $scope.simpanPenduduk = function() {
    	   console.log($scope.penduduk);
    	   console.log($scope.penduduk.noKK	);
        $http.post('/api/penduduk/insert', $scope.penduduk).then(sukses, gagal);
        function sukses(response) {
            console.log(response);
        }
        function gagal(response) {
            console.log(response);       
        }
    }
      



});