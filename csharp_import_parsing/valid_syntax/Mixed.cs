    using     System    ;//gggg
     using     g =   System.Collections.Generic;
using System.IO;
using System.Text      ;
using     p =    roslyn_ast_parser.Program    ;   
//using System.IO.using ;

//We cannot import private class
//using p3 = roslyn_ast_parser.Child.Program2.Program3;

using roslyn_ast_parser.Child;

//This is uncommented comment (uncomment this and run)

//This is a comment, it should not be picked
//using Microsoft.CodeAnalysis.CSharp.Syntax;

//static import : supported from C# v6.0 onwards
using    static     System.Math;

//alias of import
using s =    System.DateTime;

//alias of import of generic class
using list = System.Collections.Generic.List<int>;

//using top-level statements  is supported from c# 9.0(preview), this should not be picked by parser
var path = "test.txt";
using (var fs = new FileStream(path, FileMode.Open, FileAccess.Read))
{
    using (var sr = new StreamReader(fs, Encoding.UTF8))
    {
        string content = sr.ReadToEnd();
        Console.WriteLine(content);
    }
}

namespace roslyn_ast_parser
{
    //alias of import inside namespace
    using tz = System.TimeZone;

    using System.Linq;
    using System.Linq;
    using Microsoft.CodeAnalysis;

    class Mixed
    {
        public struct Point
        {
            public double X { get; set; }
            public double Y { get; set; }
            //Below features: expression-bodied property, expression-bodied method, interpolated string are available from c# 6.0 only
            //Below features: readonly is available from c# 8.0 only
            public double Distance => Math.Sqrt(X * X + Y * Y);

            public readonly override string ToString() =>
                $"({X}, {Y}) is {Distance} from the origin";
        }

        //Below features: tuples is available from c# 7.0 only
        (string Alpha, string Beta) namedLetters = ("a", "b");
    }
}

namespace roslyn_ast_parser.Child
{
    class Program2
    {
        private class Program3
        {
        }
    }
    namespace roslyn_ast_parser.Child2
    {
        
    }
}

