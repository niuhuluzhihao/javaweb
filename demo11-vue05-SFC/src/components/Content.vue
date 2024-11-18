<script setup>
// 接受父组件的函数
import {defineProps} from "vue"
    defineProps({
        message:String
    })
</script>

<template>
    <div>
       主要内容
       {{message}}
    </div>
</template>

<style scoped>

</style>
