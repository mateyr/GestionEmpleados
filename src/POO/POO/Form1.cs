using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace POO
{
    public partial class Form1 : Form
    {
        List<ActivoFijo> activoFijos;
        public Form1()
        {
            InitializeComponent();

            activoFijos = new List<ActivoFijo>();
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label5_Click(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {

        }

        private ActivoFijo ReadActivoFijo()
        {   //En el Designer se agrega el defecto del ComboBox
            string codigo = txtCode.Text;
            string nombre = txtName.Text;
            String type = cmbType.SelectedItem.ToString();
            TipoActivo typeActi;
            switch (type)
            {
                case "Edificio" { typeActi = TipoActivo.Edificio; break; }
            }

            decimal.TryParse(txtValor.Text, out decimal valor);
            decimal.TryParse(txtValorResidual.Text, out decimal valorR);
        }

        private void txtCode_Validating(object sender, CancelEventArgs e)
        {
            if (string.IsNullOrWhiteSpace(txtCode.Text))
            {
                txtCode.BackColor = Color.Pink;
                e.Cancel = true;
            }

        }
    }
}
