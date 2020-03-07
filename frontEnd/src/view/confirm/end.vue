<template>
  <div class="end">
    <van-button block class="btn" ></van-button>
  </div>
</template>

<script>
import { Button} from "vant";

export default {
  components: {
    [Button.name]: Button,
  },

  data() {
    return {
    };
  },

  methods: {
    
  }
};
</script>

<style lang="less">
.end {
  width: 100%;
  height: 100%;
  // margin-top:20em;
  display: flex;
  flex-flow: row wrap;
  justify-content: center;
  align-items: center;
  align-content: center;

  .btn{
    width: 90%;
    height: 40em;
    // background-image: ~"url('./src/assets/end.jpg')";
    // background-image: ~"url('../../assets/end.jpg')";
    background-image: url('../../assets/end.jpg');
    background-repeat:no-repeat;
  }
}
</style>
