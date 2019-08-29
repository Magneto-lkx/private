app.controller('searchController',function ($scope, searchService) {
    $scope.searchMap={'keywords':'','category':'','brand':'','spec':{},'price':'','pageNo':1,'pageSize':40,'sortField':''};//搜索封装对象

    //设置排序规则
    $scope.sortSearch=function(sortField,sort){
        $scope.searchMap.sortField=sortField;
        $scope.searchMap.sort=sort;
        $scope.search();
    }  //判断当前页为第一页
    $scope.isTopPage=function(){
        if($scope.searchMap.pageNo==1){
            return true;
        }else{
            return false;
        }
    }

    //判断当前页是否未最后一页
    $scope.isEndPage=function(){
        if($scope.searchMap.pageNo==$scope.resultMap.totalPages){
            return true;
        }else{
            return false;
        }
    };


            //搜索
    $scope.search=function(){
        $scope.searchMap.pageNo= parseInt($scope.searchMap.pageNo) ;
        searchService.search($scope.searchMap).success(
            function(response){

                $scope.resultMap=response;
                buildPagelabel();
            }
        );
    }


    //根据页码查询
    $scope.queryByPage=function(pageNo){
        //页码验证
        if(pageNo<1 || pageNo>$scope.resultMap.totalPages){
            return;
        }
        $scope.searchMap.pageNo=pageNo;
        $scope.search();
    };

    buildPagelabel=function () {
       $scope.pageLabel=[];//新增分页栏属性
       var maxPageNo = $scope.resultMap.totalPages;//得到最后页码
       var firstPage=1;//开始页码
       var lastPage=maxPageNo;//截至页码
        $scope.firstDot=true;//前面有点
        $scope.lastDot=true;//后边有点
       if(
           $scope.resultMap.totalPages>5
       ){
           if ($scope.searchMap.pageNo<=3){
               lastPage=5
               $scope.firstDot=false;//前面没点
           }else if($scope.searchMap.pageNo>=lastPage-2){
               firstPage=maxPageNo-4;
               $scope.lastDot=false;//后边没点
           }else{
               firstPage=$scope.searchMap.pageNo-2;
               lastPage=$scope.searchMap.pageNo+2
           }
       }else{
           $scope.firstDot=false;//前面无点
           $scope.lastDot=false;//后边无点
       }

        for (var i=firstPage;i<=lastPage;i++){
           $scope.pageLabel.push(i)
                }
   }

    //移除复合搜索条件
    $scope.removeSearchItem=function (key) {
        if (key=='category' || key=='brand'||"key"=='price'){
            //如果是分类或品牌
            $scope.searchMap[key]="";

        }else{
            delete $scope.searchMap.spec[key];//移除此属性
        }
    };
    //添加搜索项
    $scope.addSearchItem=function (key, value) {
        if(key=='category' || key=='brand'|| "key"=='price' ){
            //如果点击的是分类或品牌
            $scope.searchMap[key]=value;
        }else{
            $scope.searchMap.spec[key]=value;
        }
    };

});