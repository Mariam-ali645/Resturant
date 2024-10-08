export class Order {
    id:number;
    name:string;
    data_created:Date;
    data_upated:Date;
    price:number;
    description:string;


    constructor(id: number, name: string, data_created: Date, data_upated: Date, price: number, description: string) {
        this.id = id;
        this.name = name;
        this.data_created = data_created;
        this.data_upated = data_upated;
        this.price = price;
        this.description = description;
    }
}
