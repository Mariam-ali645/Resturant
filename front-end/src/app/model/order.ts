export class Order {
    id:number;
    name:string;
    data_create:Date;
    data_update:Date;
    price:number;
    description:number;


    constructor(id: number, name: string, data_create: Date, data_update: Date, price: number, description: number) {
        this.id = id;
        this.name = name;
        this.data_create = data_create;
        this.data_update = data_update;
        this.price = price;
        this.description = description;
    }
}
