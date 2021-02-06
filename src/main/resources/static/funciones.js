function deleteFun(id) {
	swal({
	  title: "Are you sure to delete the record?",
	  icon: "warning",
	  buttons: true,
	  dangerMode: true,
	})
	.then((OK) => {
	  if (OK) {
		
		$.ajax({
			url:"/delete/" + id,
			success: function(res){
				console.log(res);
			}
		});
		
	    swal("The record has been deleted!", {
	      icon: "success",
	    }).then((OK)=>{
			if(OK){
				location.href="/listar";
			}
		});
		
	  }
	});
}