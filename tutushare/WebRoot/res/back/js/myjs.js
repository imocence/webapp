
$(document).ready(function(){ 
 //显示隐藏左边
 $("#tohide").click(function(){
	var lsisedisplay = $("#lside").css("display");
	if(lsisedisplay != "none"){
		$("#lside").hide();
	 	$(this).attr("class","to_show");
		$("#tohide a img").attr("src","../images/backstage_green/toright.jpg");
	 	$("#rside").css( {"padding-left": "0px" , "background-position": "-189px top"} );
		
		}else{
			$("#lside").show();
	 		$(this).attr("class","to_hide");
			$("#tohide a img").attr("src","../images/backstage_green/toleft.jpg");
	 		$(".r_side").css( {"padding-left": "189px" , "background-position": "0px top"} );
			}
	 });
	 	 
 //全选
 $("#checkboxall").click(function(){
	 $("[name=items]:checkbox").attr("checked",this.checked); 
	 });
 $("[name=items]:checkbox").click(function(){
	 var flag = true;
	 $("[name=items]:checkbox").each(function(){
		 if(!this.checked){
			 flag = false;
			 }
		 });
		$("#checkboxall").attr("checked",flag); 
	 });
  //折叠
 //$("#lside .icenter_list h2").eq(0).addClass("current");
 $("#lside .icenter_list h2.current").next('.u1').show(); 
 $("#lside .icenter_list h2").click(function(){    
 	$(this).next(".u1").slideToggle("slow").siblings(".u1:visible").slideUp("slow");    
 	$(this).toggleClass("current");    
 	$(this).siblings("h2").removeClass("current"); 
	}); 
	
	//显示隐藏头像
 $(".icenter_slice_up").click(function(){ 
 	 $(this).toggleClass("icenter_slice_down");
	 $("#slicebox").toggle();
 });	
}); 