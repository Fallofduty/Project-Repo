<?php
include("inc/data.php");
include("inc/function.php");

if (isset($_GET["id"])) {
    $id=$_GET["id"]; // this is getting the id of the books and movies that
    // aka can be 101
    if (isset($catalog[$id])) { // checks if id matches
       
        $item = $catalog[$id];
        // this gets the whole value for the items aka list author reviews everything
        // var_dump($item);
    }
}
if (!isset($item)) {
    header("location:catalog.php");
    exit;
}
$pageTitle = $item["title"];
$section = null;
include("inc/header.php");
?>
    <div class="section page">

        <div class="wrapper">
            <div class="media-picture">

            <span>
                <img src="<?php echo $item["img"]; ?>" alt="<?php echo $item["img"]; ?>"/>
                </span>
            </div>
            <div class="media-details">
                <h1><?php echo $item["title"]?></h1>
                <table>
                    <tr>
                        <th>category</th>
                        <td><?php echo $item["category"]?></td>
                    </tr>
                    <tr>
                        <th>Genre</th>
                        <td><?php echo $item["genre"]?></td>
                    </tr>
                    <tr>
                        <th>category</th>
                        <td><?php echo $item["format"]?></td>
                    </tr>
                    <tr>
                        <th>year</th>
                        <td><?php echo $item["year"]?></td>
                    </tr>
                    <?php
                    if (strtolower($item["category"]) =="books") {
                        ?>
                    <tr>
                        <th>Authors</th>
                        <td><?php echo implode(",", $item["authors"])?></td>
                    </tr>
                    <tr>
                        <th>publisher</th>
                        <td><?php echo $item["publisher"]; ?></td>
                    </tr>
                    <tr>
                        <th>ISBN</th>
                        <td><?php echo $item["isbn"]; ?></td>
                    </tr>

    
                   <?php
                    } elseif (strtolower($item["category"])=="movies") {   ?>
                     <tr>
                        <th>director</th>
                        <td><?php echo $item["director"]; ?></td>
                    </tr>
                    <tr>
                        <th>Stars</th>
                        <td><?php echo implode(",", $item["stars"])?></td>
                    </tr>
                    <tr>
                        <th>writers</th>
                        <td><?php echo implode(",", $item["writers"])?></td>
                    </tr>


                   <?php } elseif (strtolower($item["category"])=="music") {   ?>
                    <tr>
                        <th>Artist</th>
                        <td><?php echo $item["artist"];?></td>
                    </tr>
                  <?php }?>
                </table>

            </div>
        </div>



    </div>


<?php include("inc/footer.php");?>