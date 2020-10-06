<?php
include("inc/data.php");
include("inc/function.php");

$pageTitle = "Full catalog";

$section = null;
if (isset($_GET["cat"])) {
    if ($_GET["cat"]=="books") {
        $pageTitle = "Books";
        $section = "books";
    } elseif ($_GET["cat"] == "movies") {
        $pageTitle = "Movies";
        $section = "movies";
    } elseif ($_GET["cat"] == "music") {
        $pageTitle = "Music";
        $section = "music";
    }
}
include("inc/header.php");
?>
<div class="section catalog page">
<a href=""></a>
    <div class="wrapper">

        <h1><?php if (!($section!=null)) {
    echo "<a href='catalog.php'></a> &gt";
}?></h1>;

        <ul class="items">
            
        <?php
        $categories = array_category($catalog, $section);
       // var_dump($categories);
        #region
        /*
        in here catergory has the value of
        array(4) { [0]=> int(101) [1]=> int(102) [2]=> int(103) [3]=> int(104) }

        */
        #endregion
           foreach ($categories as $id) {
               echo get_item_html($id, $catalog[$id]);
            
               #region explanation
            // id is they of the array for example catalog had [101]
            // then look for 101
            // then go to $catalog[101] => which will find the img assosiated
            // with the key and print the section pic
            #endregion
           }

    
    #region explanation
    // id is they of the array for example catalog had [101]
    // then look for 101
    // then go to $catalog[101] => which will find the img assosiated
    // with the key and print the pic;
    #endregion

?>
        </ul>
    </div>

</div>

<?php include("inc/footer.php") ?>