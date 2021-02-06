function getData(){
	    $.ajax({
	    	type: "GET",
	    	url: '/getBusinessLine', 
	    	async: false,
	    	success: function(data){
	    		$.each(data,function(key, registro) {
	    			$("#cb-businesLine").append('<option>'+registro+'</option>');
				})
	    	},
	    	error: function(data) {
	    		alert('error');
	    	}
	    });
}