# EasyCodeRule

该项目为 IntelliJ IDEA 中 EasyCode 插件的规则仓库，主要用于生成DB Table相关的类。

## 特殊说明

EasyCode基于Velocity，语法问题找[文档](https://velocity.apache.org/engine/devel/user-guide.html)

## 适用范围

SpringBoot + Mybatis + MySql项目

## EasyCode 配置说明

### Somunsm模板

| 包名         | 描述           |
|------------|--------------|
| entity     | DB实体类        |
| param      | 接口请求参数类      |
| sortParam  | 接口请求排序字段索引枚举 |
| vo         | 接口响应类        |
| mapper     | DAO层         |
| service    | Service层     |
| controller | Controller层  |

### SomunsmBasic模板

| 包名        | 描述   |
|-----------|------|
| exception | 异常类  |
| page      | 分页   |
| result    | 响应对象 |
| status    | 状态码  |

### Template

| 模板分类名        | 描述                                                                            |
|--------------|-------------------------------------------------------------------------------|
| Somunsm      | 生成Controller、Service、ServiceImpl、Mapper、Mapper.xml、Entity、Param、Vo、SortParam等 |
| SomunsmBasic | somunsm模板分类生成的类所需的基础类                                                         |

### Global Config

| 配置名                | 描述                   |
|--------------------|----------------------|
| apiPrefix          | 接口地址前缀 \| 如：api/     |
| queryPagePath      | [必须] 分页接口及具体实现的存放路径  |
| responseResultPath | [必须] 统一响应类及状态码存放路径   |
| field_optimistic   | 乐观锁的字段名（蛇形命名），不需要则留空 |
| field_remove       | [必须] 逻辑删除的字段名（蛇形命名）  |