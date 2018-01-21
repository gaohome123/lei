      **_`IDEA 使用练习`_**
      改变git 地址
      git remote rm origin
      git remote add origin https://github.com/gaohome123/ssmDemo.git
      
      **git 用远程覆盖本地**
      
      git fetch --all
      git reset --hard origin/master
      
      Swagger与SpringMVC整合
      http://www.cnblogs.com/jtlgb/p/6734177.html
      说明： 
           其中@ApiOperation和@ApiParam为添加的API相关注解，个参数说明如下： 
           @ApiOperation(value = “接口说明”, httpMethod = “接口请求方式”, response = “接口返回参数类型”, notes = “接口发布说明”；其他参数可参考源码； 
           @ApiParam(required = “是否必须参数”, name = “参数名称”, value = “参数具体描述”
           https://www.cnblogs.com/xmplatform/p/5785065.html
           https://www.jianshu.com/p/67c9b84226cd
