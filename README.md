## IDEA 使用练习
      改变git 地址
      git remote rm origin
      git remote add origin https://github.com/gaohome123/ssmDemo.git
      
## git 用远程覆盖本地
      
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
## git创建和切换分支
一、查看本地分支
    $ git branch
    \* master
    2、查看远程分支
    git branch -r
    3、查看所有分支
    git branch -a

二、本地创建新的分支
    命令如下：
    git branch [branch name]   
    切换到新的分支
    git checkout [branch name]
    
    例如：
    Ricky@DESKTOP-1QPASTR MINGW64 /f/Git_Studio/design-patterns (master)
    $ git checkout gh-dev
    Switched to branch 'gh-dev'
    Ricky@DESKTOP-1QPASTR MINGW64 /f/Git_Studio/design-patterns (gh-dev)
    
   创建+切换分支 创建分支的同时切换到该分支上，命令如下：
   git checkout -b [branch name]
   
   git checkout -b [branch name] 的效果相当于以下两步操作：
   git branch [branch name]
   git checkout [branch name]
   
   将新分支推送到github 命令如下：
   git push origin [branch name]
   
   删除本地分支_
   git branch -d [branch name]
   
   删除github远程分支
   git push origin :[branch name]
    
 ## webservice 集成
  http://blog.csdn.net/lkmtao/article/details/54644681
