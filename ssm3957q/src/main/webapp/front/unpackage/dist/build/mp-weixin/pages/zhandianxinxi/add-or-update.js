(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/zhandianxinxi/add-or-update"],{"0853":function(n,e,t){"use strict";t.r(e);var a=t("c945"),i=t.n(a);for(var r in a)"default"!==r&&function(n){t.d(e,n,(function(){return a[n]}))}(r);e["default"]=i.a},2190:function(n,e,t){"use strict";var a=t("5026"),i=t.n(a);i.a},5026:function(n,e,t){},a703:function(n,e,t){"use strict";t.r(e);var a=t("eae1"),i=t("0853");for(var r in i)"default"!==r&&function(n){t.d(e,n,(function(){return i[n]}))}(r);t("2190");var u,o=t("f0c5"),c=Object(o["a"])(i["default"],a["b"],a["c"],!1,null,"759a2faa",null,!1,a["a"],u);e["default"]=c.exports},c945:function(n,e,t){"use strict";(function(n){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0;var a=i(t("a34a"));function i(n){return n&&n.__esModule?n:{default:n}}function r(n,e,t,a,i,r,u){try{var o=n[r](u),c=o.value}catch(f){return void t(f)}o.done?e(c):Promise.resolve(c).then(a,i)}function u(n){return function(){var e=this,t=arguments;return new Promise((function(a,i){var u=n.apply(e,t);function o(n){r(u,a,i,o,c,"next",n)}function c(n){r(u,a,i,o,c,"throw",n)}o(void 0)}))}}var o=function(){Promise.all([t.e("common/vendor"),t.e("components/w-picker/w-picker")]).then(function(){return resolve(t("f3ba"))}.bind(null,t)).catch(t.oe)},c={data:function(){return{ruleForm:{zhandianmingcheng:"",zhandianfenlei:"",dizhi:"",fachejiange:"",xiangqing:"",tupian:""},zhandianfenleiOptions:[],zhandianfenleiIndex:0,user:{},ro:{zhandianmingcheng:!1,zhandianfenlei:!1,dizhi:!1,fachejiange:!1,xiangqing:!1,tupian:!1}}},components:{wPicker:o},computed:{},onLoad:function(e){var t=this;return u(a.default.mark((function i(){var r,u,o,c;return a.default.wrap((function(i){while(1)switch(i.prev=i.next){case 0:return r=n.getStorageSync("nowTable"),i.next=3,t.$api.session(r);case 3:return u=i.sent,t.user=u.data,i.next=7,t.$api.option("zhandianfenlei","fenlei",{});case 7:if(u=i.sent,t.zhandianfenleiOptions=u.data,t.ruleForm.userid=n.getStorageSync("userid"),e.refid&&(t.ruleForm.refid=e.refid,t.ruleForm.nickname=n.getStorageSync("nickname")),!e.id){i.next=17;break}return t.ruleForm.id=e.id,i.next=15,t.$api.info("zhandianxinxi",t.ruleForm.id);case 15:u=i.sent,t.ruleForm=u.data;case 17:if(!e.cross){i.next=48;break}o=n.getStorageSync("crossObj"),i.t0=a.default.keys(o);case 20:if((i.t1=i.t0()).done){i.next=48;break}if(c=i.t1.value,"zhandianmingcheng"!=c){i.next=26;break}return t.ruleForm.zhandianmingcheng=o[c],t.ro.zhandianmingcheng=!0,i.abrupt("continue",20);case 26:if("zhandianfenlei"!=c){i.next=30;break}return t.ruleForm.zhandianfenlei=o[c],t.ro.zhandianfenlei=!0,i.abrupt("continue",20);case 30:if("dizhi"!=c){i.next=34;break}return t.ruleForm.dizhi=o[c],t.ro.dizhi=!0,i.abrupt("continue",20);case 34:if("fachejiange"!=c){i.next=38;break}return t.ruleForm.fachejiange=o[c],t.ro.fachejiange=!0,i.abrupt("continue",20);case 38:if("xiangqing"!=c){i.next=42;break}return t.ruleForm.xiangqing=o[c],t.ro.xiangqing=!0,i.abrupt("continue",20);case 42:if("tupian"!=c){i.next=46;break}return t.ruleForm.tupian=o[c],t.ro.tupian=!0,i.abrupt("continue",20);case 46:i.next=20;break;case 48:t.styleChange();case 49:case"end":return i.stop()}}),i)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},zhandianfenleiChange:function(n){this.zhandianfenleiIndex=n.target.value,this.ruleForm.zhandianfenlei=this.zhandianfenleiOptions[this.zhandianfenleiIndex]},tupianTap:function(){var n=this;this.$api.upload((function(e){n.ruleForm.tupian=n.$base.url+"upload/"+e.file,n.$forceUpdate(),n.$nextTick((function(){n.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var n=this;return u(a.default.mark((function e(){return a.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(!n.ruleForm.id){e.next=5;break}return e.next=3,n.$api.update("zhandianxinxi",n.ruleForm);case 3:e.next=7;break;case 5:return e.next=7,n.$api.add("zhandianxinxi",n.ruleForm);case 7:n.$utils.msgBack("提交成功");case 8:case"end":return e.stop()}}),e)})))()},optionsChange:function(n){this.index=n.target.value},bindDateChange:function(n){this.date=n.target.value},getDate:function(n){var e=new Date,t=e.getFullYear(),a=e.getMonth()+1,i=e.getDate();return"start"===n?t-=60:"end"===n&&(t+=2),a=a>9?a:"0"+a,i=i>9?i:"0"+i,"".concat(t,"-").concat(a,"-").concat(i)},toggleTab:function(n){this.$refs[n].show()}}};e.default=c}).call(this,t("543d")["default"])},e8bb:function(n,e,t){"use strict";(function(n){t("29f7");a(t("66fd"));var e=a(t("a703"));function a(n){return n&&n.__esModule?n:{default:n}}n(e.default)}).call(this,t("543d")["createPage"])},eae1:function(n,e,t){"use strict";var a;t.d(e,"b",(function(){return i})),t.d(e,"c",(function(){return r})),t.d(e,"a",(function(){return a}));var i=function(){var n=this,e=n.$createElement;n._self._c},r=[]}},[["e8bb","common/runtime","common/vendor"]]]);