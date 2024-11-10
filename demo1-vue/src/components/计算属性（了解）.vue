<script setup>
/*
单项绑定 v-bind 响应式数据发生变化的时候，更新dom树，用户的操作如何造成页面内容的改变不会影响响应式数据
双向绑定， v-model由于用户操作发生变化，也会同步修改对应的响应式数据
  双向绑定都用于表单标签

    v-model:value
*/
  import {ref,reactive,computed} from "vue"

  const author = reactive({
    "name":"张三",
    books:["shuben1","shuben2","shuben3"]
  })




  // 通过方法获得数据
  function hasBooks(){
    return author.books.length>0?"是":"否"
  }


  // 通过计算属性返回数据
  let bookMessage = computed(()=>{
    return author.books.length>0?"是":"否"
  })



</script>

<template>
<div>
  <p> 作者:{{author.name}}</p>
  是否出版过图书：{{hasBooks()}} <br>
  是否出版过图书：{{bookMessage}} <br>

</div>
</template>

<style scoped>

</style>
