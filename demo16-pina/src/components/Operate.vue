<script setup>
import {definePerson} from "../store/store.js"
let person = definePerson()
</script>

<template>
<div>
    <h1>用于修改pina数据</h1>
    <hr>
    展示一下person的数据:{{person}}
</div>

</template>

<style scoped>

</style>
