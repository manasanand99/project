import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Calc4WheelerComponent } from './calc4-wheeler.component';

describe('Calc4WheelerComponent', () => {
  let component: Calc4WheelerComponent;
  let fixture: ComponentFixture<Calc4WheelerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Calc4WheelerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(Calc4WheelerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
