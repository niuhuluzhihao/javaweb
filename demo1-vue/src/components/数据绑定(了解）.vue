<script setup>
/*
单项绑定 v-bind 响应式数据发生变化的时候，更新dom树，用户的操作如何造成页面内容的改变不会影响响应式数据
双向绑定， v-model由于用户操作发生变化，也会同步修改对应的响应式数据
  双向绑定都用于表单标签

    v-model:value
*/
  import {ref,reactive,computed,watch,watchEffect} from "vue"

  let fullName = ref("")
  let firstName = ref("")
  let lastName=reactive({
    name:""
  })

  watch(firstName,(newValue,oldValue)=>{
    fullName.value=newValue+lastName.name
  })




  // 监听一个属性
  watch(()=>lastName.name,(newValue,oldValue)=>{
    fullName.value = firstName.value+newValue
  })


  watch(()=>lastName.name,(newValue,oldValue)=>{
    fullName.value = firstName.value+lastName.name
  },{deep:true})

  watchEffect(()=>{
    fullName.value = firstName.value+lastName.name

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
  姓氏：<input type ="text" v-model="firstName"> <br>
  名字：<input type ="text" v-model="lastName.name"> <br>
  全名：{{fullName}}

</div>
</template>

<style scoped>

</style>
........................................................