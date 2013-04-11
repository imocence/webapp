function setTab(name,cursel,n){
	for(i=1;i<=n;i++){
		var zx=document.getElementById(name+i);
		var con=document.getElementById("con_"+name+"_"+i);
		zx.className=i==cursel?"hover":"";
		con.style.display=i==cursel?"block":"none";
	}
}
