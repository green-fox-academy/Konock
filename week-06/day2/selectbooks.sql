SELECT book_name AS Title, author.aut_name AS Author, category.cate_descrip AS Category, publisher.pub_name AS Publisher, book_mast.book_price AS Price
FROM bookstore.book_mast
INNER JOIN author ON book_mast.aut_id = author.aut_id
INNER JOIN category ON book_mast.cate_id = category.cate_id
INNER JOIN publisher ON book_mast.pub_id = publisher.pub_id;