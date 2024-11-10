<script setup>
/*
v-if:表达式或者数据，数据为true的时候，则当前元素渲染进入dom树
v-else：自动和前面一个v-if做取反操作，否则不展示

*/
  import {ref,reactive} from "vue"
  let pro = ref("产品")

  let items= reactive([
    {
      id:"item1",
      message:"薯片"
    },
    {
      id:"item2",
      message:"可乐"
    },
    {
      id:"item3",
      message:"炸鸡"
    }
  ])

let carts = reactive(
  [
    {
      name: "可乐",
      price: "3",
      number: "10"
    },
    {
      name: "薯片",
      price: "6",
      number: "12"
    },
    {
      name: "炸鸡",
      price: "12",
      number: "10"
    }
  ]
)
function compute(){
  let total = 0
  console.log(carts)
  for (let index in carts){
    total += carts[index].price*carts[index].number
  }
  console.log(total)
  return total 


}


function removeCart(index){
  carts.splice(index,1)
}

function clearCart(){
  carts.splice(0,carts.length)
}

</script>

<template>
<div>
  <h1>您的购物车如下</h1>
  <table border="1px">
    <thead>
      <tr>
        <th>序号</th>
        <th>名称</th>
        <th>价格</th>
        <th>数量</th>
        <th>小计</th>
        <th>操作</th>
      </tr>
    </thead>
    <!--当购物车中又购物项项目的时候，展示这个tbody--->
    <tbody v-if ="carts.length >0">
      <tr v-for = "(cart,index) in carts" v-bind:key="index">
        <td v-text = "index+1"></td>
        <td v-text = "cart.name"></td>
        <td v-text = "cart.price"></td>
        <td v-text = "cart.number"></td>
        <td v-text = "cart.price*cart.number"></td>
        <td>
          <button @click="removeCart(index)">
            删除
          </button>
        </td>
      </tr>
    </tbody>
    <tbody v-else>
      <tr>
        <td colspan = "6">购物车空了</td>
      </tr>
    </tbody>
    
  </table>
  购物车总金额 {{compute()}}元
  <button @click="clearCart()">一键删除购物车</button>

  <hr>

  <ur>
    <li v-for = "(item,index) in items" v-bind:key="item.id">
     {{pro}} {{index+1}} {{item.message}}
    </li>
  </ur>
 

</div>
</template>

<style scoped>

</style>
