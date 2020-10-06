<?php

function get_item_html($id, $item)
{
    $output =  "<li><a href='#'>
    <img src='".$item["img"]."'
    alt='".$item["title"]."'/>".
    "<p>view details</p>".
     "</a></li>";

    return $output;
}

function array_category($catalog, $category)
{
    $output = array();
    foreach ($catalog as $id => $item) {
        if ($category == null
        or strtolower($category) ==
        strtolower($item["category"])) {
            $sort = $item["title"];
            // sout ==> sort will be based on $item aka tile
            $sort = ltrim($sort, "The ");
            $sort = ltrim($sort, "A ");
            $sort = ltrim($sort, "An ");

            $output[$id]= $sort;
            // id will be 1001 something like that will
            // sort will title
        }
    }
    asort($output);

    return array_keys($output);
}


?>

