$(document).ready(function(){
	
	
	// event pada saat link di click
	$('.page-scroll').on('click', function(e){

	// Ambil isi href
	var tujuan = $(this).attr('href');
	
	// tangkap elemen ybs
	var elemenTujuan = $(tujuan);


	
	//pindah scroll
	$('html, body').animate({
		scrollTop: elemenTujuan.offset().top - 70
	}, 1000, 'swing');

	e.preventDefault();
});
	
	
	
});

