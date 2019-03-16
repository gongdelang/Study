# 数据结构基础
---
*目录*

[TOC]

## 数据类型
- 结构型
    变量中所装的是数据元素的内容，如int、double...
    **复杂型:**
    `数组`   二维数组可以看成一维数组里面的一维数组
    `结构体`   用户自定义数组类型
    >*例子：*
    二维数组b[3][3]，包含三个元素，其中每一个元素是一个一维3元素的数组。
    类似于一个一维数组a[3](内部元素的含有a、b、c,3个int元素的struct)，那么b[0][0] ~= a[0].a。

- 指针型
    变量里面所装的值是指针,一般和结构型组合起来使用（eg：链表的结点、二叉树结点）

- 结点的构造
1. 链表的结点
    链表的结点有两个域：一个是数据域、一个指针域。**因为结点中的next类型是Node，所以要用typedef将struct预先定义成Node,不然内部不认识Node类型**
    ```C
    typedef struct Node
    {
        int data;                   //存放结点数据
        struct Node *next;          //存放Node型指针
    }Node;
    ```
    ```graphLR
        A[data next]-.->B[data next]
    ```
2. **二叉树结点**
    在链表结点的基础上，再加上一个指向同类型的指针域。
    ```C
    typdef struct BTNode
    {
        int data;
        struct BTNode *lchild;      //左子结点指针
        struct BTNode *rchild;      //右子结点指针
    }BTNode;
    ```
