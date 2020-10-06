<?php
include("inc/data.php");
include("inc/function.php");
$pageTitle = "Personal Media Libary";
$section = null;
include("inc/header.php");
?>
		<div class="section catalog random">

			<div class="wrapper">

				<h2>May we suggest something?</h2>
                  
				<ul class="items">
					<?php
            $random = array_rand($catalog, 4);
foreach ($random as $id) {
    echo get_item_html($id, $catalog[$id]);
    
    #region explanation
    // id is they of the array for example catalog had [101]
    // then look for 101
    // then go to $catalog[101] => which will find the img assosiated
    // with the key and print the pic;
    #endregion
}
?>
				</ul>

			</div>

		</div>

	</div> <!--end content-->

<?php include("inc/footer.php"); ?>