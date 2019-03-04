需求：两个项目的字段名和方法名查重

项目地址举例：http://git.analysys.cn/bigdata-platform/escheduler

目标：
提供1个程序，可以指定2个待比较的本地项目的路径，进行查重，输出2个文件

文件一：
|字段名  |包路径  | 类名 |
|---|---|---|
| hello |com.analysys.ark  |HelloWord|
| hello |com.analysys.ark  |HelloWordTest|
| hello |com.noah.ark  |HelloTest|
| world |com.analysys.ark  |HelloWord|
| world |com.analysys.ark  |HelloWordTest|
| world |com.noah.ark  |WorldTest|
| ... |...  |...|

文件二:
|方法名 |方法返回类型|包路径  | 类名 |
|---|---|---|---|
| hello |String|com.analysys.ark  |HelloWord|
| hello |Long|com.analysys.ark  |HelloWordTest|
| hello |void|com.noah.ark  |HelloTest|
| ... |...|...  |...|
