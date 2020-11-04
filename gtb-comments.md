### 完成度：
* 只有查询学员和增加学员的功能

### 测试：
* 没有测试

### 知识点：
* Spring Boot 依赖注入及 MVC 方面的 annotations 还不太熟

__Details:__
- \- StudentController.java:14 推荐使用构造函数注入

### 工程实践：
* 推荐用 lombok

__Details:__
- \- StudentController.java:20 直接写成 return studentService.findAll(); 就行
- \- StudentController.java:28 不要留 print 语句！
- \- StudentController.java:31 决定 id 不是 controller 的职责
- \- id 也不能由 size 来决定，日后有了删除功能，id 会重复的

### 综合：


