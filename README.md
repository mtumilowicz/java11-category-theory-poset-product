# java11-category-theory-poset-product
_Reference_: https://en.wikiversity.org/wiki/Introduction_to_Category_Theory/Products_and_Coproducts#Examples

Preliminary info (with basic intuitions) about product 
(category theory): https://github.com/mtumilowicz/java11-category-theory-set-product

# greatest lower bound is a Product in the Poset Category
Greatest lower bound in a poset (if it exists) for two elements, 
is a (actually the unique, not just up to isomorphism) product of 
those two elements.

This provides lots of examples where products might exist for 
some, all, or no pairs of elements in a category.

(proof is quite easy, and strictly based on the definition of
the greatest lower bound)

let `p x q := p ^ q` (`^` - greatest lower bound)

1. then we have projections:
    * `p ^ q <= p ==> p ^ q -> p`
    * `p ^ q <= q ==> p ^ q -> q`
1. and uniqueness
    * if there is other `P'` that: 
    `P' <= p` and `P' <= q` then `P' <= p ^ q` (
    by definition of greatest lower bound)