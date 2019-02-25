# learn

> 学习 Java

## One Day

* git用法
     git add .  添加
	 git commit -a -m " "  提交
	 git status 查看修改文件
	 git diff  查看具体修改内容
	 git push   提交到远程服务器

## Two Day

* 对象和类
     对象：一个具体实例，有状态和行为
	      创建对象就是要先声明一个对象，然后用关键字new来创建对象（实例化）用new创建对象时，会调用构造方法初始化对象。
	 类：一个模板，用来描述对象的状态行为
	 变量：实例变量必须创建对象后才可以通过这个对象来使用，静态变量则可以直接使用类名来引用

* 修饰符
     public  private  protected

* 循环结构
     for循环   while循环   do...while循环

* 条件语句
     if  if...else

* Java switch case语句
     switch遇到break switch语句终止，跳转到switch语句后面的语句执行
	 case语句如果没有break，程序会继续执行下一条case语句，直到出现break语句

* Java Number & Math 类
     Math.ceil返回大于等于( >= )给定参数的的最小整数
	 Math.floor返回小于等于（<=）给定参数的最大整数
	 Math.round它表示四舍五入

## Three Day

* 数组
     数组索引值必须从0开始

## Four Day

* 读取文件
     FilelnputStream与FileOutputStream的区别:FileOutputStream如果该流在打开文件进行输出前，目标文件不存在，那么该流会创建该文件
* 删除目录或文件
     当删除目录时，必须保证该目录下没有其他文件才能正确删除，否则删除失败

* Java Scanner类
     next()与nextLine()区别
	 next()字符前的空白会被自动去掉，输入有效字符后才将其后面输入的空白作为分隔符或者结束符；next()不能得到带空格的字符串。
	 nextLine()以Enter为结束符，可以获得空白
* Java异常处理
## Five Day

* Java 继承
     可以单继承，可以多重继承（一传一传一）也可以不同类继承同一类（多传一） 不可以多继承（一传多）

* 重写与重载
     区别点|重载方法|重写方法
	 --|:--:|--:
	 参数列表|必修修改|一定不能修改
	 返回类型|可以修改|一定不能修改
	 异常|可以修改|可以减少或删除，一定不能抛出新的或者更广的异常
	 访问|可以修改|一定不能做更严格的限制（可以降低限制）

*Java 抽象类

*Java 封装

*Java 接口