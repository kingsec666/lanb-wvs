<template>
  <div class="panel" style="height: 500px;">
    <i class="iconfont icon-404" style="font-size: 300px;"></i>
    <div class="info">
      页面走丢了
      <p>
        <a style="margin-top: 16px;" class="button" @click="$router.go(-1)">返回上一页</a>
      </p>
    </div>
  </div>
</template>

<script>
export default {

  name: 'blankPage',

  data () {
    return {

    }
  }

}
</script>

<style scoped>
.panel {
  display: flex;
  align-items: center;
  justify-content: center;
  text-align: center;
}

.info {
  margin-top: -25px;
  font-size: 25px;
  width: 100%;
}
</style>
