mod A;

static B: i32 = 1;
enum D { D1, D2 }
struct E { e1: D, e2: D}
union F { e1: D, e2: D}
type G = E;

trait H { fn h () -> (); }
impl H for E { fn h () -> () { /* */ }; }

fn i () -> () { }

fn main() {
  i();
}

"string"
/* adas */