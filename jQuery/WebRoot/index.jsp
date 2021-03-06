<meta charset="utf-8">
	
	
	
	
	
	
	
	
	<style>
	.ui-autocomplete-loading { background: white url('images/ui-anim_basic_16x16.gif') right center no-repeat; }
	</style>
	<script>
	$(function() {
		var cache = {},
			lastXhr;
		$( "#birds" ).autocomplete({
			minLength: 2,
			source: function( request, response ) {
				var term = request.term;
				if ( term in cache ) {
					response( cache[ term ] );
					return;
				}

				lastXhr = $.getJSON( "search.php", request, function( data, status, xhr ) {
					cache[ term ] = data;
					if ( xhr === lastXhr ) {
						response( data );
					}
				});
			}
		});
	});
	</script>



<div class="demo">

<div class="ui-widget">
	<label for="birds">Birds: </label>
	<input id="birds" />
</div>

</div><!-- End demo -->



<div class="demo-description">
<p>The Autocomplete widgets provides suggestions while you type into the field. Here the suggestions are bird names, displayed when at least two characters are entered into the field.</p>
<p>Similar to the remote datasource demo, though this adds some local caching to improve performance. The cache here saves just one query, and could be extended to cache multiple values, one for each term.</p>
</div><!-- End demo-description -->