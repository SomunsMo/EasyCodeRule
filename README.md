# EasyCodeRule

## 项目说明

该项目为 IntelliJ IDEA 中 EasyCode 插件的规则仓库。主要用于生成DB Table的相关类，包括但不限于：

### Somunsm模板

| 包名         | 描述          |
|------------|-------------|
| Entity     | DB实体类       |
| Param      | 接口请求参数类     |
| Vo         | 接口响应类       |
| Mapper     | DAO层        |
| Service    | Service层    |
| Controller | Controller层 |

### SomunsmBasic模板

| 包名        | 描述   |
|-----------|------|
| exception | 异常类  |
| Page      | 分页   |
| Result    | 响应对象 |
| Status    | 状态码  |

## EasyCode 配置说明

### Template

| 模板分类名        | 描述                                                                 |
|--------------|--------------------------------------------------------------------|
| Somunsm      | 生成Controller、Service、ServiceImpl、Mapper、Mapper.xml、Entity、Param、Vo |
| SomunsmBasic | somunsm模板分类生成的类所需的基础类                                              |

### Global Config

| 配置名                | 描述                   |
|--------------------|----------------------|
| queryPagePath      | [必须] 分页接口及具体实现的存放路径  |
| responseResultPath | [必须] 统一响应类及状态码存放路径   |
| field_optimistic   | 乐观锁的字段名（蛇形命名），不需要则留空 |
| field_remove       | [必须] 逻辑删除的字段名（蛇形命名）  |

## 适用范围

SpringBoot + Mybatis + MySql项目