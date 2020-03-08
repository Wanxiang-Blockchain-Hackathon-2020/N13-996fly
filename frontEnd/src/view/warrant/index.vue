<template>
  <div class="welcome">
      <van-overlay :show="show" @click="show = false">
        <div class="wrapper" @click="toRegister">
          <div class="block" >
              <div class="title">2</div>
              <p>员工查看派遣凭证，并进行核实</p>
              <img src="../../assets/step.png" alt="欢迎">
          </div>
        </div>
      </van-overlay>
  </div>
</template>

<script>
import { Overlay } from "vant";

export default {
  components: {
    [Overlay.name]: Overlay
  },

  data() {
    return {
      show: true
    };
  },

  methods: {
    toRegister() {
      this.$router.push({
        name: "warrant/list",
        params: { userId: "123" }
      });
      // this.$router.push({path: '/resourceManagement'})
    }
  }
};
</script>

<style lang="less">
.welcome {
  width: 100%;
  height: 100%;
  display: flex;
  flex-flow: row wrap;
  justify-content: center;
  position: relative;

  .btn-tj {
    position: absolute;
    top: 190%;
    width: 80%;
  }

  .wrapper {
    width: 100%;
    height: 100%;
    display: flex;
    align-items: center;
    justify-content: center;

      .block {
        display: flex;
        flex-flow: col nowrap;
        justify-content: center;
        align-items: center;
        display: block;

        color: white;
        .title{
          width: 4em;
          height: 4em;
          font-size: 15px;
          border: 2px white solid;

          box-sizing: border-box;

          display: flex;
          justify-content: center;
          align-items: center;
          margin: 0 auto;

          border-radius: 50%;
          background-color: rgb(25, 137, 250);
        }
      }
  }

}
</style>
