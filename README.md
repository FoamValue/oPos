# oPos
Open Source Pos

# 前言

突然想利用业余时间写一个简单的开源 POS 系统，今天（2020-07-19）提交第一个 commit。

虽然，开源 POS 系统有很多。但是，自己的开源项目可以使用一些喜欢的、想要尝试的框架、工具。想想还是蛮有趣的，不是么？

# 介绍


## 一个基本的设计思路

![基本的设计思路](https://github.com/FoamValue/oPos/blob/master/doc/images/%E5%9F%BA%E6%9C%AC%E7%9A%84%E8%AE%BE%E8%AE%A1%E6%80%9D%E8%B7%AF.png)

未完待续。



## 提交消息规范 Commit Message Specification

```
<type>(<scope>): <subject>
<BLANK LINE>
<body>
<BLANK LINE>
<footer>
```

### type
更改的类型。

+ feat：新功能（feature）
+ fix：修补 bug（需要提供 bug 编号）
+ perf：提高性能
+ docs：文档（documentation）
+ chore：构建过程或辅助工具的变动
+ style：格式（不影响代码运行的变动）
+ refactor：重构（即不是新增功能，也不是修改bug的代码变动）
+ test：增加测试

### scope
更改的作用域。

+ oPos-client
+ oPos-common
+ oPos-service

### subject
更改的主题。使用现在时的命令性语气，不要大写第一个字母，文字末尾不加句号。

### body
对变更的描述，改变的动机，并将其与以前的行为进行对比。

### footer
引用此提交关闭的 GitHub 问题的地方。

