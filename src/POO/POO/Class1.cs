using System;
using System.Collections.Generic;
using System.Text;

namespace POO
{
    public class ActivoFijo
    {
        public string Code { get; set; }
        public string Name { get; set; }
        public string ValorActivo { get; set; }
        public TipoActivo Tipo { get; set; }

        public decimal ValorResidual { get; set;}
        //public string Code
        //{
        //    get
        //    {
        //        return code;
        //    }
        //    set
        //    {
        //        code = value;
        //    }
        //}


        //public string Name
        //{
        //    get => name;
        //    set => name = value;
        //}

    }
}
