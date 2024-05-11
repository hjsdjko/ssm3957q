<template>
	<view class="content">
		<form class="app-update-pv">
			
									<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(204, 153, 204, 1)","margin":"0 0 20rpx 0","borderWidth":"4rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(204, 153, 204, 1)","textAlign":"left"}' class="title">名称</view>
				<input :style='{"boxShadow":"0 0 10rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(204, 153, 204, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.mingcheng" v-model="ruleForm.mingcheng" placeholder="名称"></input>
			</view>
												<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(204, 153, 204, 1)","margin":"0 0 20rpx 0","borderWidth":"4rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(204, 153, 204, 1)","textAlign":"left"}' class="title">周边分类</view>
				<picker @change="zhoubianfenleiChange" :value="zhoubianfenleiIndex" :range="zhoubianfenleiOptions">
					<view :style='{"boxShadow":"0 0 10rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(204, 153, 204, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.zhoubianfenlei?ruleForm.zhoubianfenlei:"请选择周边分类"}}</view>
				</picker>
			</view>
												<view :style='{"boxShadow":"0 0 10rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(204, 153, 204, 1)","margin":"0 0 20rpx 0","borderWidth":"4rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group" @tap="fengmiantupianTap" :class='left == "left"?"":"active"'>
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(204, 153, 204, 1)","textAlign":"left"}' class="title">封面图片</view>
				<view class="right-input" :style='{textAlign:"left"}' style="padding:0">
					<image :style='{"width":"88rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' class="avator" v-if="ruleForm.fengmiantupian" :src="ruleForm.fengmiantupian" mode="aspectFill"></image>
					<image :style='{"width":"88rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
												<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(204, 153, 204, 1)","margin":"0 0 20rpx 0","borderWidth":"4rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(204, 153, 204, 1)","textAlign":"left"}' class="title">详细地址</view>
				<input :style='{"boxShadow":"0 0 10rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(204, 153, 204, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.xiangxidizhi" v-model="ruleForm.xiangxidizhi" placeholder="详细地址"></input>
			</view>
												<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(204, 153, 204, 1)","margin":"0 0 20rpx 0","borderWidth":"4rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(204, 153, 204, 1)","textAlign":"left"}' class="title">联系方式</view>
				<input :style='{"boxShadow":"0 0 10rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(204, 153, 204, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.lianxifangshi" v-model="ruleForm.lianxifangshi" placeholder="联系方式"></input>
			</view>
																					<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(204, 153, 204, 1)","margin":"0 0 20rpx 0","borderWidth":"4rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(204, 153, 204, 1)","textAlign":"left"}' class="title">更新时间</view>
				<picker mode="date" :value="ruleForm.gengxinshijian" @change="gengxinshijianChange">
					<view :style='{"boxShadow":"0 0 10rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(204, 153, 204, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.gengxinshijian?ruleForm.gengxinshijian:"请选择更新时间"}}</view>
				</picker>
			</view>
									
			<!-- 否 -->
 
			
			          				          				          				          				          				          				          							
			          				          				          				          				          				          				<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(204, 153, 204, 1)","margin":"0 0 20rpx 0","borderWidth":"4rpx","borderStyle":"solid","height":"308rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(204, 153, 204, 1)","textAlign":"left"}' class="title">内容</view>
				<textarea :style='{"boxShadow":"0 0 10rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(204, 153, 204, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"280rpx"}' v-model="ruleForm.neirong" placeholder="内容"></textarea>
			</view>
						          							
			<view class="btn">
				<button :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"rgba(204, 153, 204, 1)","borderColor":"rgba(204, 153, 204, 1)","borderRadius":"8rpx","color":"#fff","borderWidth":"1","width":"80%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

																																	
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				ruleForm: {
												mingcheng: '',
																zhoubianfenlei: '',
																fengmiantupian: '',
																xiangxidizhi: '',
																lianxifangshi: '',
																neirong: '',
																gengxinshijian: '',
												},
																				zhoubianfenleiOptions: [],
				zhoubianfenleiIndex: 0,
																																																				// 登陆用户信息
				user: {},
                                ro:{
                                   mingcheng : false,
                                   zhoubianfenlei : false,
                                   fengmiantupian : false,
                                   xiangxidizhi : false,
                                   lianxifangshi : false,
                                   neirong : false,
                                   gengxinshijian : false,
                                },
			}
		},
		components: {
			wPicker
		},
		computed: {
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					},
		async onLoad(options) {
    		        this.ruleForm.gengxinshijian = this.$utils.getCurDate();
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
						// ss读取
																																																
																		// 下拉框
			res = await this.$api.option(`zhoubianfenlei`,`zhoubianfenlei`,{});
			this.zhoubianfenleiOptions = res.data;
																																							
			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`zhoubianxinxi`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='mingcheng'){
					this.ruleForm.mingcheng = obj[o];
					this.ro.mingcheng = true;
					continue;
					}
					if(o=='zhoubianfenlei'){
					this.ruleForm.zhoubianfenlei = obj[o];
					this.ro.zhoubianfenlei = true;
					continue;
					}
					if(o=='fengmiantupian'){
					this.ruleForm.fengmiantupian = obj[o];
					this.ro.fengmiantupian = true;
					continue;
					}
					if(o=='xiangxidizhi'){
					this.ruleForm.xiangxidizhi = obj[o];
					this.ro.xiangxidizhi = true;
					continue;
					}
					if(o=='lianxifangshi'){
					this.ruleForm.lianxifangshi = obj[o];
					this.ro.lianxifangshi = true;
					continue;
					}
					if(o=='neirong'){
					this.ruleForm.neirong = obj[o];
					this.ro.neirong = true;
					continue;
					}
					if(o=='gengxinshijian'){
					this.ruleForm.gengxinshijian = obj[o];
					this.ro.gengxinshijian = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},
																																																
			// 多级联动参数
																																																
																																													gengxinshijianChange(e) {
				this.ruleForm.gengxinshijian = e.target.value;
				this.$forceUpdate();
			},
						
																																													
															// 下拉变化
			zhoubianfenleiChange(e) {
				this.zhoubianfenleiIndex = e.target.value
				this.ruleForm.zhoubianfenlei = this.zhoubianfenleiOptions[this.zhoubianfenleiIndex]
			},
																																				
																											fengmiantupianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.fengmiantupian = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},
																																													
			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																if(this.ruleForm.id){
					await this.$api.update(`zhoubianxinxi`, this.ruleForm);
				}else{
					await this.$api.add(`zhoubianxinxi`, this.ruleForm);
				}
				this.$utils.msgBack('提交成功');
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 88rpx;
	}
	
	.select .uni-input {
		line-height: 88rpx;
	}
	
	.input .right-input {
		line-height: 88rpx;
	}
</style>
